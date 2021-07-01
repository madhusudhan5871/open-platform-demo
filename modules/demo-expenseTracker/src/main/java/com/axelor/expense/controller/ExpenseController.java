package com.axelor.expense.controller;

import com.axelor.expense.db.Expense;
import com.axelor.expense.db.repo.ExpenseRepository;
import com.axelor.meta.CallMethod;

public class ExpenseController {
  @CallMethod
  public String getTag() {
    return "from tag-get :p";
  }

  @CallMethod
  public void checkMove() {
    System.out.println(
        "printing here for testing whether it is getting called or not in action method kanban on move");
    ;
    ExpenseRepository ep = new ExpenseRepository();

    Expense ex = ep.findByCategory("Basic");
    System.out.println(ex);
  }
}
