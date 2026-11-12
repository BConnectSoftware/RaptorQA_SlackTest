package com.bconnect.slackdemo

import android.app.Application
import com.bconnect.raptorqa.RaptorQAContext

public class SlackDemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        RaptorQAContext.configure(
            application = this,
            accountId = "RQA10031",
            appId = "7432dd18-4a07-49c8-b4c7-bf42dc7f0eba"
        )
    }
}