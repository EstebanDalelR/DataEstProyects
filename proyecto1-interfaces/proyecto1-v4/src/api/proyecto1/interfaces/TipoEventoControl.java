package api.proyecto1.interfaces;

/*
 * TipoEventoControl se refiere a los eventos de control que pueden recibir tanto la central de llamadas
 * como la central de vehiculo y es de donde se deben sacar los datos para modelar el comportamiento de las centrales.
 */
public enum TipoEventoControl{
 INICIAR_CENTRAL_VEHICULO,
 CREAR_VEHICULO,
 AGREGAR_EVENTOS_AUTORIZADOS,
 ATENDER_EVENTOS,
 CREAR_AGENTE,
 ACTIVAR_AGENTE,
 AGREGAR_CLIENTE,
 ATENDER_LLAMADAS,
 AGREGAR_PEDIDO_DESPACHO,
 AGREGAR_RUTA,
 ASOCIAR_RUTA_VEHICULO,
 RECIBIR_EVENTOS,
 CONSOLIDAR_EVENTOS,
 INICIAR_CENTRAL_LLAMADAS,
 ATENDER_LLAMADA,
 CERRAR_CASO,
 CONSOLIDAR_LLAMADAS
}
