package ru.gb.lesson5;

import java.util.List;

/**
 * {
 *   "users": [
 *     {
 *       "login": "anonymous"
 *     },
 *     {
 *       "login": "nagibator"
 *     },
 *     {
 *       "login": "admin"
 *     }
 *   ]
 * }
 */
public class ListResponse {

  private List<User> users;

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
