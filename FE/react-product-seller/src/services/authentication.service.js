import { BASE_API_URL } from "../common/constants";
import axios from "axios";

const BASE_URL = BASE_API_URL + "/api/authentication";

class AuthenticationService {
  login(user) {
    return axios.post(BASE_URL + "/sign-in", user);
  }

  register(user) {
    return axios.post(BASE_URL + "/sign-up", user);
  }
}

// eslint-disable-next-line import/no-anonymous-default-export
export default new AuthenticationService();