package com.resourceservice.model;

public class CreateResourceDTO {

    String name;
    String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public static final class CreateResourceDTOBuilder {
        String name;
        String description;

        private CreateResourceDTOBuilder() {
        }

        public static CreateResourceDTOBuilder aCreateResourceDTO() {
            return new CreateResourceDTOBuilder();
        }

        public CreateResourceDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CreateResourceDTOBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CreateResourceDTO build() {
            CreateResourceDTO createResourceDTO = new CreateResourceDTO();
            createResourceDTO.name = this.name;
            createResourceDTO.description = this.description;
            return createResourceDTO;
        }
    }
}
