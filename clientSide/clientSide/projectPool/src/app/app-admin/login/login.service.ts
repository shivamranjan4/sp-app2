import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url :string  = configuration.url;

  // url:string = "http://localhost:9090/admin/login";

  
  constructor(private httpClient : HttpClient) { }

  doLogin(user:any)
  {
    return this.httpClient.post<any>(this.url + 'admin/login' ,user.value) ;
  }

}
