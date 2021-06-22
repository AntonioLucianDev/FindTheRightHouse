package com.asusoftware.FindTheRightHouse.post.model.dto;

import com.asusoftware.FindTheRightHouse.post.model.Apartment;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
public class ApartmentDto {

    @Id
    private UUID id;
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

    public static ApartmentDto toDto(Apartment apartment) {
        ApartmentDto apartmentDto = new ApartmentDto();
        apartmentDto.setId(apartment.getId());
        apartmentDto.setNumberOfRooms(apartment.getNumberOfRooms());
        apartmentDto.setSizeOfApartment(apartment.getSizeOfApartment());
        apartmentDto.setHaveGarage(apartment.isHaveGarage());
        apartmentDto.setHaveTerrace(apartment.isHaveTerrace());
        apartmentDto.setBuildIn(apartment.getBuildIn());
        apartmentDto.setHaveLift(apartment.isHaveLift());
        apartmentDto.setFloor(apartment.getFloor());
        apartmentDto.setCountry(apartment.getCountry());
        apartmentDto.setCity(apartment.getCity());
        apartmentDto.setAddress(apartment.getAddress());
        apartmentDto.setCap(apartment.getCap());
        return apartmentDto;
    }


}