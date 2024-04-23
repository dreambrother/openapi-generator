<?php

/**
 * OpenAPI Petstore
 * PHP version 8.x
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

namespace OpenAPIServer\Api;


abstract class AbstractUserApi
{

    /**
     * Operation createUser
     * Path: /user
     *
     * Create user
     *
     * @param \OpenAPIServer\Model\User $user Created user object (required)
     *
     * @return void
     */
    public function createUser(\OpenAPIServer\Model\User $user): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation createUsersWithArrayInput
     * Path: /user/createWithArray
     *
     * Creates list of users with given input array
     *
     * @param array $user List of user object (required)
     *
     * @return void
     */
    public function createUsersWithArrayInput(array $user): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation createUsersWithListInput
     * Path: /user/createWithList
     *
     * Creates list of users with given input array
     *
     * @param array $user List of user object (required)
     *
     * @return void
     */
    public function createUsersWithListInput(array $user): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation deleteUser
     * Path: /user/{username}
     *
     * Delete user
     *
     * @param string $username The name that needs to be deleted (required)
     *
     * @return void
     */
    public function deleteUser(string $username): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation getUserByName
     * Path: /user/{username}
     *
     * Get user by user name
     *
     * @param string $username The name that needs to be fetched. Use user1 for testing. (required)
     *
     * @return \OpenAPIServer\Model\User|null
     */
    public function getUserByName(string $username): \OpenAPIServer\Model\User|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation loginUser
     * Path: /user/login
     *
     * Logs user into the system
     *
     * @param string $username The user name for login (required)
     * @param string $password The password for login in clear text (required)
     *
     * @return string|null
     */
    public function loginUser(string $username, string $password): string|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation logoutUser
     * Path: /user/logout
     *
     * Logs out current logged in user session
     *
     *
     * @return void
     */
    public function logoutUser(): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation updateUser
     * Path: /user/{username}
     *
     * Updated user
     *
     * @param string $username name that need to be deleted (required)
     * @param \OpenAPIServer\Model\User $user Updated user object (required)
     *
     * @return void
     */
    public function updateUser(string $username, \OpenAPIServer\Model\User $user): void
    {
        throw new \Exception('Not implemented');
    }

}
