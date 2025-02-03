package np.com.bimalkafle.geminiaichatbot

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.google.ai.client.generativeai.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.generationConfig

class HomeViewModel: ViewModel() {

init{
    val config = generationConfig {
        temperature = 0.70f
    }

    val generativeMode = GenerativeModel(
        modelName = "gemini-pro-vision",
        apiKey = BuildConfig.apiKey,
        generationConfig = config
    )
}
    fun questioning(userInput: String, selectedImage: List<Bitmap>) {

    }
}

