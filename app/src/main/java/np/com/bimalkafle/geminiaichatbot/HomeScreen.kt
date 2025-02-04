package np.com.bimalkafle.geminiaichatbot

import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import org.tensorflow.lite.schema.Padding
import java.lang.reflect.Modifier

@Composable
fun AppContent(viewModel: HomeViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {

    val appUiState = viewModel.uiState.collectAsState()

    HomeScreen(

    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(uiState: HomeUiState = HomeUiState.Loading, onSendClicked: (String, List<Uri>)){

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Gemini AI chatbot") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        bottomBar = {
            Column {
                Row{

                }
            }
        }
    ) {

    }

}
