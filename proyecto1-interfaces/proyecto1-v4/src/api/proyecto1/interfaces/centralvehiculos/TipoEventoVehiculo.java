package api.proyecto1.interfaces.centralvehiculos;

/*
 * TipoEventoVehiculo se refiere al enum de tipos de eventos reportados por los veh�culos
 * a la central de veh�culos
 * Los tipos de eventos se refieren al anexo A del enunciado del proyecto 1
 */
public enum TipoEventoVehiculo{
 INICIAR_RUTA,
 TERMINAR_RUTA,
 ENCENDER_VEHICULO,
 APAGAR_VEHICULO,
 ABRIR_PUERTA_VEHICULO,
 CERRAR_PUERTA_VEHICULO,
 SUBIR_PASAJERO,
 BAJAR_PASAJERO,
 ABRIR_PUERTA_CARGA,
 CERRAR_PUERTA_CARGA,
 SENSOR_PESO,
 SENSOR_TEMPERATURA,
 SENSOR_INCLINACION
}
