import { Injectable } from '@angular/core';
import { AppConfigService } from 'src/app/app-config.service';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class UserService {

	private url: string = "";

	constructor(
        private http: HttpClient,
		private appService: AppConfigService) {
		this.url = this.appService.baseUrl
	}

	findOne(personId: number) {
		return this.http.get(this.url + this.appService.personUrl + "/" + personId);
	}

	create(person: any) {
		return this.http.post(this.url + this.appService.personUrl, person);
	}

	update(personId: number, person: any) {
		return this.http.put(this.url + this.appService.personUrl + "/" + personId, person);
	}

	disable(personId: number) {
		return this.http.delete(this.url + this.appService.personUrl + "/" + personId)
	}

	listCombo(personCategoryId: number) {
		return this.http.get(this.url + this.appService.personUrl + "/culture/" + personCategoryId);
	}
}