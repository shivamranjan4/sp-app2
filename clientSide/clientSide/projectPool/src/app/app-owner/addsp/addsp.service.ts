import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class AddspService {

  // url : string = 'http://localhost:9090' ;

  url : string = configuration.url;
  

  constructor(private httpClient : HttpClient) { }

  addSp(swimmingPool : any)
  {
    return this.httpClient.post<any>(this.url + 'swimmingPool/save',swimmingPool.value);
  }
}
