import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class ListspService 
{
  // url : string = 'http://localhost:9090/swimmingPool';

  url : string = configuration.url;

  constructor(private httpClient : HttpClient) { }

  list(username:any)
  {
    return this.httpClient.get<any>(this.url+'swimmingPool/list/'+username) ;
  }

  findPool(id : any)
  {
    return this.httpClient.get<any>(this.url+'swimmingPool/findPool/'+id) ; 
  }

  save(pool : any)
  {
    return this.httpClient.post<any>(this.url+'swimmingPool/update', pool.value) ;
  }
}
