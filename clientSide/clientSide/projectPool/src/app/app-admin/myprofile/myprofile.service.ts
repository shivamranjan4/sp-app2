import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class MyprofileService {

  url : string = configuration.url;

  // url : string = "http://localhost:9090/admin/myprofile" ;
  
  constructor(private httpClient : HttpClient) { }

  toRead(email : any)
  {
    return this.httpClient.get<any>(this.url + 'admin/myprofile/read/'+email)  ;  
  }

  toSave(user : any)
  {
    return this.httpClient.post<any>(this.url + 'admin/myprofile/save', user.value);
  }

}
