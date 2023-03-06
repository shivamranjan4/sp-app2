import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class ForgotpasswordService {

  url :string  = configuration.url;
  
  constructor(private httpClient: HttpClient) { }

  forgotPass(email : any)
  {
    return this.httpClient.post<any>(this.url + 'admin/forgotPassword',email.value) ; 
  }

}
