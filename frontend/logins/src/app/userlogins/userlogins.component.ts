import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { subscribe } from 'node:diagnostics_channel';
import { response } from 'express';




@Component({
  selector: 'app-userlogins',
  standalone: true,
  imports: [],

  templateUrl: './userlogins.component.html',
  styleUrl: './userlogins.component.css'
})
export class UserloginsComponent {

  username!: string;
  password!: string;

  constructor() {}


  logins() {
    console.log ('username:',this.username)
    console.log ('password:',this.password)



  }





}
