package uk.gov.dhsc.htbhf.smartstub.model.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(onConstructor_ = {@JsonCreator})
public class CreateCardResponse {

    @JsonProperty("cardAccountId")
    private String cardAccountId;
}
