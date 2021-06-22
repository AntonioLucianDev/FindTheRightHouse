package com.asusoftware.FindTheRightHouse.post.model.dto;

import com.asusoftware.FindTheRightHouse.post.model.Apartment;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateApartmentDto {

    @NotNull
    private int numberOfRooms;
    @NotNull private int numberBathroom;
    @NotNull private Long sizeOfApartment;
    @NotNull private boolean haveGarage;
    @NotNull private boolean haveTerrace;
    @NotNull private int buildIn;
    @NotNull private boolean haveLift;
    @NotNull private int floor;
    @NotBlank
    private String country;
    @NotBlank String city;
    @NotBlank String address;
    @NotNull int cap;

    public static Apartment toEntity(CreateApartmentDto apartmentDto) {
        Apartment apartment = new Apartment();
        apartment.setNumberOfRooms(apartmentDto.getNumberOfRooms());
        apartment.setSizeOfApartment(apartmentDto.getSizeOfApartment());
        apartment.setHaveGarage(apartmentDto.isHaveGarage());
        apartment.setHaveTerrace(apartmentDto.isHaveTerrace());
        apartment.setBuildIn(apartmentDto.getBuildIn());
        apartment.setHaveLift(apartmentDto.isHaveLift());
        apartment.setFloor(apartmentDto.getFloor());
        apartment.setCountry(apartmentDto.getCountry());
        apartment.setCity(apartmentDto.getCity());
        apartment.setAddress(apartmentDto.getAddress());
        apartment.setCap(apartmentDto.getCap());
        return apartment;
    }
}
