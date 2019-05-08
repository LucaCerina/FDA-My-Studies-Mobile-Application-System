/*******************************************************************************
 * Copyright � 2017-2019 Harvard Pilgrim Health Care Institute (HPHCI) and its Contributors. 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 * 
 * Funding Source: Food and Drug Administration (�Funding Agency�) effective 18 September 2014 as
 * Contract no. HHSF22320140030I/HHSF22301006T (the �Prime Contract�).
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" ,WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
/*
 * Copyright � 2017-2018 Harvard Pilgrim Health Care Institute (HPHCI) and its Contributors.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * Funding Source: Food and Drug Administration ("Funding Agency") effective 18 September 2014 as Contract no.
 * HHSF22320140030I/HHSF22301006T (the "Prime Contract").
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package com.hphc.mystudies.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides information about pass score, comprehension questions
 * {@link QuestionnaireActivityStepsBean} and correct answers details
 * {@link CorrectAnswersBean}
 * 
 * @author BTC
 *
 */
public class ComprehensionDetailsBean {

	private Integer passScore = 0;
	private List<QuestionnaireActivityStepsBean> questions = new ArrayList<>();
	private List<CorrectAnswersBean> correctAnswers = new ArrayList<>();

	public Integer getPassScore() {
		return passScore;
	}

	public void setPassScore(Integer passScore) {
		this.passScore = passScore;
	}

	public List<QuestionnaireActivityStepsBean> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionnaireActivityStepsBean> questions) {
		this.questions = questions;
	}

	public List<CorrectAnswersBean> getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(List<CorrectAnswersBean> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

}