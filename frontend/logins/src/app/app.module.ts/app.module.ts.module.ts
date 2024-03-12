import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from '../app.component';
import { UserloginsComponent } from '../userlogins/userlogins.component';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient } from '@angular/common/http';
import { ReactiveFormsModule} from '@angular/forms';






@NgModule({
  declarations: [

  ],
  imports: [
    CommonModule,
    FormsModule,
    BrowserModule,
    UserloginsComponent,
    NgModule,
    HttpClient,
    ReactiveFormsModule,
    AppComponent
  ]
})
export class AppModuleTsModule { }
