#Author: wsimarra


@Regresion
Feature: usuario realiza pago factura energia.
  @PagoCancelado
  Scenario: REALIZAR PAGO FACTURA,
    Given INGRESAR USUARIO Y CLAVE "wilmer.simarra@gmail.com" y clave "123simarra123"
     When INGRESO_A_MIS_FACTURAS
     And  SELECIONA_DOCUMENTO_A_PAGAR
#    And  SELECIONAR_TIPO_PERSONA_JURIDICA_NATURAL
#    And  SELECIONAR_BANCO
#    And  INICIAR_PAGO
#    And  REGISTRAR_EMAIL
#    And  IR_BANCO
    Then CANCELAR_PAGO
