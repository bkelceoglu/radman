package software.netcore.radman.buisness.service.attribute.converter;

import software.netcore.radman.buisness.service.attribute.dto.AuthenticationDto;
import software.netcore.radman.buisness.conversion.DtoConverter;
import software.netcore.radman.data.internal.entity.RadCheckAttribute;

/**
 * @since v. 1.0.0
 */
public class RadCheckAttributeToDtoConverter implements DtoConverter<RadCheckAttribute, AuthenticationDto> {

    @Override
    public AuthenticationDto convert(RadCheckAttribute source) {
        AuthenticationDto target = new AuthenticationDto();
        target.setId(source.getId());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
        target.setSensitive(source.isSensitive());
        return target;
    }

}
