package com.clouway.factory;


/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class XMLCodec implements Codec {
//
//  @Override
//  public String transformFromObject(Object obj) {
//    ByteArrayOutputStream baos = new ByteArrayOutputStream();
//    PrintStream old = System.out;
//    System.setOut(new PrintStream(baos));
//    try {
//      JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
//      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//      jaxbMarshaller.marshal(obj, System.out);
//    } catch (JAXBException e) {
//      e.printStackTrace();
//    }
//    String xmlAsStr = baos.toString();
//    System.setOut(old);
//    return xmlAsStr;
//  }
//
//  /**
//   * Parsing XML from stream to Object.
//   *
//   * @param type
//   * @param stream
//   * @param <T>
//   * @return
//   * @throws JAXBException
//   * @throws IOException
//   */
//  @Override
//  @SuppressWarnings("unchecked")
//  public <T> T transformToObjects(TypeReference<T> type, InputStream stream) throws JAXBException {
//    JAXBContext context = JAXBContext.newInstance((Class) type.getType());
//    Unmarshaller unmarshaller = context.createUnmarshaller();
//    return (T) unmarshaller.unmarshal(stream);
//  }

}
