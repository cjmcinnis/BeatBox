package com.cmcinnis.craig.beatbox;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SoundViewModelTest {
    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject;

    @Before
    public void setUp() throws Exception {
        mBeatBox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);

    }

    @Test
    public void exposesSoundNameAsTitle(){
        assertThat(mSubject.getTitle(), Is.is(mSound.getName()));
    }

    @Test
    public void callsBeatBoxPlayOnButtonClicked(){
        mSubject.onButtonClicked();

        verify(mBeatBox).play(mSound);
    }
}