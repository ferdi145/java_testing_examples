package examples.apifetch.directlyfromapi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class FetchFromApi {

    @Disabled("long running because of real API call")
    @Test
    void fetchFromApi() {
        APeopleApiService peopleApiService = new APeopleApiService();

        var result = peopleApiService.peopleWithEyeColor("blue");

        Assertions.assertThat(result)
                .containsExactly(
                        "Luke Skywalker",
                        "Owen Lars",
                        "Beru Whitesun lars"
                );
    }
}
