import { element, by, ElementFinder } from 'protractor';

export class CooperativeComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-cooperative div table .btn-danger'));
  title = element.all(by.css('jhi-cooperative div h2#page-heading span')).first();
  noResult = element(by.id('no-result'));
  entities = element(by.id('entities'));

  async clickOnCreateButton(): Promise<void> {
    await this.createButton.click();
  }

  async clickOnLastDeleteButton(): Promise<void> {
    await this.deleteButtons.last().click();
  }

  async countDeleteButtons(): Promise<number> {
    return this.deleteButtons.count();
  }

  async getTitle(): Promise<string> {
    return this.title.getAttribute('jhiTranslate');
  }
}

export class CooperativeUpdatePage {
  pageTitle = element(by.id('jhi-cooperative-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  cooperativeIdInput = element(by.id('field_cooperativeId'));
  nameInput = element(by.id('field_name'));
  areaInput = element(by.id('field_area'));

  dgSelect = element(by.id('field_dg'));
  restaurantSelect = element(by.id('field_restaurant'));
  adminsysSelect = element(by.id('field_adminsys'));
  admincoopSelect = element(by.id('field_admincoop'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setCooperativeIdInput(cooperativeId: string): Promise<void> {
    await this.cooperativeIdInput.sendKeys(cooperativeId);
  }

  async getCooperativeIdInput(): Promise<string> {
    return await this.cooperativeIdInput.getAttribute('value');
  }

  async setNameInput(name: string): Promise<void> {
    await this.nameInput.sendKeys(name);
  }

  async getNameInput(): Promise<string> {
    return await this.nameInput.getAttribute('value');
  }

  async setAreaInput(area: string): Promise<void> {
    await this.areaInput.sendKeys(area);
  }

  async getAreaInput(): Promise<string> {
    return await this.areaInput.getAttribute('value');
  }

  async dgSelectLastOption(): Promise<void> {
    await this.dgSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async dgSelectOption(option: string): Promise<void> {
    await this.dgSelect.sendKeys(option);
  }

  getDgSelect(): ElementFinder {
    return this.dgSelect;
  }

  async getDgSelectedOption(): Promise<string> {
    return await this.dgSelect.element(by.css('option:checked')).getText();
  }

  async restaurantSelectLastOption(): Promise<void> {
    await this.restaurantSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async restaurantSelectOption(option: string): Promise<void> {
    await this.restaurantSelect.sendKeys(option);
  }

  getRestaurantSelect(): ElementFinder {
    return this.restaurantSelect;
  }

  async getRestaurantSelectedOption(): Promise<string> {
    return await this.restaurantSelect.element(by.css('option:checked')).getText();
  }

  async adminsysSelectLastOption(): Promise<void> {
    await this.adminsysSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async adminsysSelectOption(option: string): Promise<void> {
    await this.adminsysSelect.sendKeys(option);
  }

  getAdminsysSelect(): ElementFinder {
    return this.adminsysSelect;
  }

  async getAdminsysSelectedOption(): Promise<string> {
    return await this.adminsysSelect.element(by.css('option:checked')).getText();
  }

  async admincoopSelectLastOption(): Promise<void> {
    await this.admincoopSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async admincoopSelectOption(option: string): Promise<void> {
    await this.admincoopSelect.sendKeys(option);
  }

  getAdmincoopSelect(): ElementFinder {
    return this.admincoopSelect;
  }

  async getAdmincoopSelectedOption(): Promise<string> {
    return await this.admincoopSelect.element(by.css('option:checked')).getText();
  }

  async save(): Promise<void> {
    await this.saveButton.click();
  }

  async cancel(): Promise<void> {
    await this.cancelButton.click();
  }

  getSaveButton(): ElementFinder {
    return this.saveButton;
  }
}

export class CooperativeDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-cooperative-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-cooperative'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
