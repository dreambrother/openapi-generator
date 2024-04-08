# NOTE: This file is auto generated by OpenAPI Generator 7.5.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Api.Default do
  @moduledoc """
  API calls for all endpoints tagged `Default`.
  """

  alias OpenapiPetstore.Connection
  import OpenapiPetstore.RequestBuilder

  @doc """

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, OpenapiPetstore.Model.FooGetDefaultResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec foo_get(Tesla.Env.client, keyword()) :: {:ok, OpenapiPetstore.Model.FooGetDefaultResponse.t} | {:error, Tesla.Env.t}
  def foo_get(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/foo")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {:default, OpenapiPetstore.Model.FooGetDefaultResponse}
    ])
  end
end
