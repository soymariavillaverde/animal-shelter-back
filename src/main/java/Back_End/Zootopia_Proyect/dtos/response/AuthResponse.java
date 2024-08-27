package Back_End.Zootopia_Proyect.dtos.response;

import Back_End.Zootopia_Proyect.models.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    String token;
    ERole role;
}
