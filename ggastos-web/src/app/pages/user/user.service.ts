import { Injectable } from '@angular/core';
import { AppConfigService } from 'src/app/app-config.service';
import { HttpService } from 'src/app/service/http.service';

@Injectable({providedIn: 'root'})
export class UserService {

	private url: string = "";

	constructor(
		private httpService: HttpService,
		private appService: AppConfigService) {
		this.url = this.appService.baseUrl
	}

	findOne(personId: number) {
		return this.httpService.get(this.url + this.appService.personUrl + "/" + personId);
	}

	create(person: any) {
		return this.httpService.post(this.url + this.appService.personUrl, person);
	}

	update(personId: number, person: any) {
		return this.httpService.put(this.url + this.appService.personUrl + "/" + personId, person);
	}

	disable(personId: number) {
		return this.httpService.delete(this.url + this.appService.personUrl + "/" + personId)
	}

	listCombo(personCategoryId: number) {
		return this.httpService.get(this.url + this.appService.personUrl + "/culture/" + personCategoryId);
	}
}