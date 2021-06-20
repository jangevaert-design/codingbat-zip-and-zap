package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatZipAndZapTest {

  private String[] zipParams = {
      "zipXzap",
      "zopzop",
      "zzzopzop",
      "zibzap",
      "zip",
      "zi",
      "z",
      "",
      "zzp",
      "abcppp",
      "azbcppp",
      "azbcpzpp"
  };

  private String[] zipExpected = {
      "zpXzp",
      "zpzp",
      "zzzpzp",
      "zibzp",
      "zp",
      "zi",
      "z",
      "",
      "zp",
      "abcppp",
      "azbcppp",
      "azbcpzp"
  };

  @Test
  void zipTest() {
    for (int i = 0; i < zipParams.length; i++) {
      String actual = CodingBatZipAndZap.zipZap(zipParams[i]);
      Assertions.assertEquals(actual, zipExpected[i]);
    }
  }


}