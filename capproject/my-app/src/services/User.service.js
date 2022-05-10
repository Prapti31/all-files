
import httpClient from "../http-common";

const get = id => {
    return httpClient.get(`/userprofile/${id}`);
}
const create = data => {
    return httpClient.post("/userprofile/saveuserjob", data);
}

export default {get,create};