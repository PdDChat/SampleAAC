package tm.sampleaac

import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import tm.sampleaac.viewmodel.MainViewModel

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()

        // Koinコンテナ生成
        startKoin(this, listOf(
            this.module
        ))
    }

    // Koinモジュール
    private val module: Module = applicationContext {
        factory { MainViewModel() }
    }
}