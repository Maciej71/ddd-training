package pro.buildmysoftware.ddd.bike.common;

import pro.buildmysoftware.ddd.bike.rental.domain.station.BikeEvent;

public interface EventPublisher {

	void publish(BikeEvent bikeEvent);
}