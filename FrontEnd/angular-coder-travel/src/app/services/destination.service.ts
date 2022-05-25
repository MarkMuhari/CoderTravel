import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Destination } from '../common/destination';

@Injectable({
  providedIn: 'root'
})
export class DestinationService {

  private baseUrl = 'http://localhost:8080/api/destinations'; 

  constructor(private httpClient: HttpClient) { }

  getDestinationList(): Observable<Destination[]> {
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.destination)
    );
  }
}

interface GetResponse {
  _embedded: {
    destination: Destination[];
  }
}
