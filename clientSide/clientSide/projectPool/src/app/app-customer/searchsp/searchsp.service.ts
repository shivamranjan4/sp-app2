import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { configuration } from 'src/app/app-config/configuration';

@Injectable({
  providedIn: 'root'
})
export class SearchspService {

  // url : string = 'http://localhost:9090/swimmingPool';

  url : string = configuration.url;

  constructor(private httpClient : HttpClient) { }

  doSearchBasic(name : any)
  {
    return this.httpClient.get<any>(this.url + 'swimmingPool/findPoolByName/' + name);
  }
  searchAdvanced(search : any)
  {
    return this.httpClient.post<any>(this.url+'swimmingPool/advancedSearch', search.value) ;
  }
  
  book(booking : any)
  {
    return this.httpClient.post<any>(this.url + 'booking/save', booking.value);
  }
}
