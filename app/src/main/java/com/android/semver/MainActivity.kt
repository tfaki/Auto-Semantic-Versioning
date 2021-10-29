package com.android.semver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val packageInfo = packageManager.getPackageInfo(packageName, 0)
        val versionName = packageInfo?.versionName
        findViewById<TextView>(R.id.version_name_tv).text = versionName

    }
}