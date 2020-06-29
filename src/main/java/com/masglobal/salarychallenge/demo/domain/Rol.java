package com.masglobal.salarychallenge.demo.domain;

import lombok.*;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
public class Rol {
    String roleName;
    String roleDescription;
    String rolId;
}
