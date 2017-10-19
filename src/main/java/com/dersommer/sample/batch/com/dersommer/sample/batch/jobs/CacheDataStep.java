package com.dersommer.sample.batch.com.dersommer.sample.batch.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class CacheDataStep implements Tasklet {
    private static Logger LOGGER = LoggerFactory.getLogger(CacheDataStep.class);
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        LOGGER.info("Running the batch...");
        Thread.sleep(3000);
        LOGGER.info("Job done");
        return RepeatStatus.FINISHED;
    }
}
