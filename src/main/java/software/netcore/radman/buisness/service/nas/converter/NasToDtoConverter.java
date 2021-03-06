package software.netcore.radman.buisness.service.nas.converter;

import software.netcore.radman.buisness.service.nas.dto.NasDto;
import software.netcore.radman.buisness.conversion.DtoConverter;
import software.netcore.radman.data.radius.entity.Nas;

/**
 * @since v. 1.0.0
 */
public class NasToDtoConverter implements DtoConverter<Nas, NasDto> {

    @Override
    @SuppressWarnings("Duplicates")
    public NasDto convert(Nas source) {
        NasDto target = new NasDto();
        target.setId(source.getId());
        target.setNasName(source.getNasName());
        target.setShortName(source.getShortName());
        target.setServer(source.getServer());
        target.setType(source.getType());
        target.setSecret(source.getSecret());
        target.setPorts(source.getPorts());
        target.setCommunity(source.getCommunity());
        target.setDescription(source.getDescription());
        return target;
    }

}
