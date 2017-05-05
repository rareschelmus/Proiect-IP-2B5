import { BuildingRepresentationPage } from './app.po';

describe('building-representation App', () => {
  let page: BuildingRepresentationPage;

  beforeEach(() => {
    page = new BuildingRepresentationPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
