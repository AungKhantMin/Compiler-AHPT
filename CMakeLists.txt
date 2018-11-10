cmake_minimum_required(VERSION 3.12)
project(Compiler_AHPT)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)
include_directories(translator)

add_executable(Compiler_AHPT
        translator/MultiDigitPostfix.cpp)
