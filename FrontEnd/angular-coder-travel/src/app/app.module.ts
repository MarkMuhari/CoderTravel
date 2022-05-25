import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DestinationListComponent } from './components/destination-list/destination-list.component';
import { HttpClientModule } from '@angular/common/http';
import { DestinationService } from './services/destination.service';

@NgModule({
  declarations: [
    AppComponent,
    DestinationListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [DestinationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
