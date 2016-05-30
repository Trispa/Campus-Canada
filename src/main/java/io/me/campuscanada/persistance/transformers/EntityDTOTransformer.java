package io.me.campuscanada.persistance.transformers;

public interface EntityDTOTransformer<E, D> {
	E toEntity(D dto);
	D toDto(E entity);
	
}
