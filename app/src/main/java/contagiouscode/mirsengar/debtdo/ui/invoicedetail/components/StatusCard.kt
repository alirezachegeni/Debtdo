package contagiouscode.mirsengar.debtdo.ui.invoicedetail.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import contagiouscode.mirsengar.debtdo.model.enums.InvoiceStatus
import contagiouscode.mirsengar.debtdo.ui.shared.StatusButton
import contagiouscode.mirsengar.debtdo.utils.Constants

@Composable
fun StatusCard(status : InvoiceStatus) {
     Card(
               shape = Constants.cardShape ,
               backgroundColor = MaterialTheme.colors.surface ,
               modifier = Modifier
                         .padding(bottom = 20.dp)
                         .clip(Constants.cardShape)
     ) {
          Column(
                    modifier = Modifier
                              .fillMaxWidth()
                              .height(IntrinsicSize.Min)
                              .padding(Constants.cardPadding) ,
          ) {
               Row(
                         modifier = Modifier.fillMaxWidth() ,
                         horizontalArrangement = Arrangement.SpaceBetween ,
                         verticalAlignment = Alignment.CenterVertically
               ) {
                    Text(
                              text = "Status" ,
                              style = MaterialTheme.typography.subtitle1 ,
                              color = MaterialTheme.colors.onBackground ,
                              modifier = Modifier.padding(bottom = 5.dp)
                    )
                    StatusButton(
                              modifier = Modifier ,
                              type = status
                    )
               }
          }
     }
}