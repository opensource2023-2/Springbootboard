package com.example.springboot_board;

import static org.junit.jupiter.api.Assertion.assertEquals;
import static org.junit.jupiter.api.Assertion.assertTrue;

import java.time.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transaction;

import com.example.springboot_board.answer.Answer;
import com.example.springboot_board.answer.AnswerRepository;
import com.example.springboot_board.question.Question;

@SpringBootTest
class SpringbootBoardApplicationTests {

	@Autowired
	private AnswerRepository answerRepository;

	@Transaction
	@Test
	void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.ispresent());
		Question q = oq.get();

		List<Answer> answerList = q.getAnswerList();

		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent);
	}
}
