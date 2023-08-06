package ru.shum;

import java.io.IOException;

public interface UserDataFileWriter {

  void writeUserData(UserData userData) throws IOException;

}
