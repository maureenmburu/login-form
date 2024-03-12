import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs';
import { json, response } from 'express';
import { error } from 'console';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseUrl ='http://localhost:80880/api/Users';

  constructor(private http: HttpClient) { }
  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.baseUrl);

  }
 

        }

      






