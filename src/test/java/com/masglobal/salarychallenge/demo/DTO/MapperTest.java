package com.masglobal.salarychallenge.demo.DTO;

import com.masglobal.salarychallenge.demo.domain.EmployeeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Mapping class test")
class MapperTest {
    private static EmployeeEntity entityTest;

    @BeforeAll
    static void initAll() {
        entityTest = EmployeeEntity
                .builder()
                .id("Test")
                .contractTypeName("HourlySalaryEmployee")
                .hourlySalary("30000")
                .build();
    }

    @Test
    public void mapToDtoWhenEntityIsCorrect() {
        EmployeeDTO result = Mapper.mapToDto(entityTest);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(43200000, result.netSalary);
    }

    @Test
    void exceptionTesting() {
        EmployeeEntity entityTestException = EmployeeEntity
                .builder()
                .id("Test")
                .contractTypeName("HourlySalaryEmployee")
                .build();
        Throwable exception = Assertions.assertThrows(NullPointerException.class, () -> {
            EmployeeDTO result = Mapper.mapToDto(entityTestException);
        });
    }
}