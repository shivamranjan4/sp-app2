import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class ResetpasswordService {

  // url  : String ='http://localhost:9090';

  url : string = configuration.url;

  constructor(private httpClient : HttpClient) { }


  doReset(resetPassword : any)
  {
      return this.httpClient.post<any>(this.url + "admin/passwordReset",resetPassword.value)
  }

}
