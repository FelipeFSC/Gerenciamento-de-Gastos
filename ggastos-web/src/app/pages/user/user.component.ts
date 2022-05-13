import { Component, OnInit } from "@angular/core";
import { ExtractDataService } from "src/app/service/extract-data.service";
import { UserService } from "./user.service";

@Component({
    selector: "app-user",
    templateUrl: "user.component.html"
})
export class UserComponent implements OnInit {

    constructor(
        private productService: UserService,
        private extractDataService: ExtractDataService
    ){}

    ngOnInit() {

    }

    onSave() {
        console.log("AAAA");

        let success = () => {
            console.log("Deu bom");
        }

        let err = () => {
            console.log("Deu MUITO RUIM!!!");
        }

        let person: any = {nome: "Teste 123"}

        this.productService.create(person)
            .subscribe(this.extractDataService.extract(success, err));
    }
}
