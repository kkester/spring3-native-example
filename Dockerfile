#FROM openjdk:21
#ADD /build/libs/service-0.0.1-SNAPSHOT.jar service.jar
#ENTRYPOINT ["java", "-jar", "/service.jar"]

FROM debian:bookworm-slim

WORKDIR /app

# Copy the native binary from the build stage
COPY --from=build /build/native/nativeCompile/service /app/service

# Run the application
CMD ["/app/service"]
