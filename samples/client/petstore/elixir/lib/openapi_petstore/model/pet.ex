# NOTE: This file is auto generated by OpenAPI Generator 7.6.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.Pet do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :category,
    :name,
    :photoUrls,
    :tags,
    :status
  ]

  @type t :: %__MODULE__{
    :id => integer() | nil,
    :category => OpenapiPetstore.Model.Category.t | nil,
    :name => String.t,
    :photoUrls => [String.t],
    :tags => [OpenapiPetstore.Model.Tag.t] | nil,
    :status => String.t | nil
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:category, :struct, OpenapiPetstore.Model.Category)
     |> Deserializer.deserialize(:tags, :list, OpenapiPetstore.Model.Tag)
  end
end

