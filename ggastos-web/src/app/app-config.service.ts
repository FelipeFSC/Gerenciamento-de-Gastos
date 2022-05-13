import { Injectable } from '@angular/core';

@Injectable()
export class AppConfigService {

	constructor() { }

	private privateLocalUrl: string = 'http://localhost:8080';

	private privateExpense: string = "/expenses";

	private privateExpenseTypes: string = "/expenseTypes";

	private privateIncomes: string = "/incomes";

	private privatePersons: string = "/persons";


	public get baseUrl(): string {
		return this.privateLocalUrl;
	}

	public get expenseUrl(): string {
		return this.privateExpense;
	}

	public get expenseTypesUrl(): string {
		return this.privateExpenseTypes;
	}

	public get incomesUrl(): string {
		return this.privateIncomes;
	}

	public get personUrl(): string {
		return this.privatePersons;
	}

}
